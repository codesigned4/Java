package minesweeper;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MineSweeper implements MouseListener{
    JFrame frame;
    Btn[][] board=new Btn[10][10];
    int WinCount;
    int flagCount=10;
    JPanel panelMain;
    JPanel panelUp=new JPanel();
    JPanel panelDown=new JPanel();
    
    JLabel labelFlag;
    JLabel labelSmile;
    public MineSweeper(){
        WinCount=0;
        frame=new JFrame("Minesweeper");
        frame.setSize(420,420);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelMain=new JPanel(new GridLayout(10,10));
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[0].length;col++){
                Btn b=new Btn(row,col);
                b.setBackground(new Color(170, 205, 190));
                panelMain.add(b);
                b.addMouseListener(this);
                board[row][col]=b;
            }
        }
        labelSmile=new JLabel();
        labelSmile.setIcon(new ImageIcon(getClass().getResource("/icons/smile.png")));
        labelFlag=new JLabel();
        labelFlag.setIcon(new ImageIcon(getClass().getResource("/icons/16pxflag.png")));
        labelFlag.setText(flagCount+"");       
        frame.add(panelMain,BorderLayout.CENTER);
        frame.add(panelUp,BorderLayout.NORTH);
        frame.add(panelDown,BorderLayout.SOUTH);
        panelDown.setLayout(new BorderLayout());
        panelDown.add(labelFlag,BorderLayout.WEST);
        panelUp.add(labelSmile,BorderLayout.CENTER);
        labelSmile.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                labelSmile.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });
        
        labelSmile.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                frame.dispose();
                new MineSweeper();
            }
        });
        
        
        generateMine(); 
        updateCount();
        frame.setLocationRelativeTo(null);
        frame.setFocusable(true);
        frame.setVisible(true);
    }
    
    public void open(int r, int c) {
                
                if (r<0||r>=board.length||c<0||c>=board[0].length||board[r][c].getText().length()>0
				||board[r][c].isEnabled()==false) {
			return;
                        
		} else if (board[r][c].getCount()!=0){
                    
                        WinCount++;
                        if(board[r][c].isFlag()){
                           ++flagCount;
                           board[r][c].setIcon(null);
                           labelFlag.setText(flagCount+"");
                        }else{
                            board[r][c].setText(board[r][c].getCount()+"");
                        }
                        board[r][c].setEnabled(false);
                        board[r][c].setBackground(new Color(244, 247, 197));
                        
                } else {
                        
                        WinCount++;
                        if(board[r][c].isFlag()){
                           ++flagCount;
                           board[r][c].setIcon(null);                           
                           labelFlag.setText(flagCount+"");
                        }
			board[r][c].setEnabled(false);
                        board[r][c].setBackground(new Color(244, 247, 197));

			open(r-1,c);
			open(r+1,c);
			open(r,c-1);
			open(r,c+1);
		}
	}
    public void generateMine(){
        int i=0;
        int x,y;
        while(i<10){            
            x=(int) (Math.random()*10);
            y=(int) (Math.random()*10);
            while(board[y][x].isMine()){
                 x=(int) (Math.random()*10);
                 y=(int) (Math.random()*10);
            }
            board[y][x].setMine(true);
            i++;
        }
    }
    public void updateCount(){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
               if(board[i][j].isMine()){ 
                       updateBombCount(i,j);                       
                   
                }
            }
        }   
    }
    
    public void updateBombCount(int row,int column){
        for(int i=row-1;i<=row+1;++i){
            for(int j=column-1;j<=column+1;++j){
                try{ board[i][j].setCount(board[i][j].getCount()+1);
                }catch(Exception e){
                    
                }
            }
        }
    }
    
    public void printMine(){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j].isMine()){
                    board[i][j].setIcon(new ImageIcon(getClass().getResource("/icons/bomb.png")));
                }else{
                    if(!(board[i][j].getCount()==0))
                    board[i][j].setText(board[i][j].getCount()+"");
                    board[i][j].setEnabled(false);
                }
            }
        }
    }
    public void openBomb(){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j].isMine()){
                    board[i][j].setBackground(Color.LIGHT_GRAY);
                    board[i][j].setIcon(new ImageIcon(getClass().getResource("/icons/bomb.png")));
                }
            }
        }
    }

    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        Btn b=(Btn) e.getComponent();
        if(e.getButton()==1){            
            if(b.isMine()){
                JOptionPane.showMessageDialog(frame, "You Stepped on a Mine.Game Over");
                labelSmile.setIcon(new ImageIcon(getClass().getResource("/icons/sad.png")));
                openBomb();
                setDisabledButtons();
                 
            }else{
                open(b.getRow(),b.getCol());
                if(WinCount==board.length*(board[0].length-1)){
                JOptionPane.showMessageDialog(frame, "Congratulations You Passed The First Level\nAre You Ready ?\nAfter Pressing the OK Button, Level 2 will Start in 5 seconds....");
                printMine();
                setDisabledButtons();
                try {
                       TimeUnit.SECONDS.sleep(5);
                    } catch (InterruptedException ex) {
                     
                    }
                frame.dispose();
                new MineSweeperLevel2();
                }
            }
        }
        else if(e.getButton()==3){           
            if(!b.isFlag()&&flagCount>0&&b.isEnabled()){
                b.setIcon(new ImageIcon(getClass().getResource("/icons/flag.png")));
                b.setFlag(true);
                --flagCount;
                labelFlag.setText(flagCount+"");
            }else if(b.isFlag()&&flagCount<10&&b.isEnabled()){
                b.setIcon(null);
                b.setFlag(false);
                ++flagCount;
                labelFlag.setText(String.valueOf(flagCount));
            }   
        }
    }
    
    public void setDisabledButtons(){
        Component[] buttons=panelMain.getComponents();
        for(Component button:buttons){
            if(button instanceof Btn){
                 button.removeMouseListener(this);
            }
        }
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
