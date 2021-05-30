import java.util.*;

public class MineSweeper {
    int row,column;

    public MineSweeper(int row,int column){
        this.row=row;
        this.column=column*2;
    }

    void run(){
        int i,j,x,y,koordinat_x,koordinat_y,bombCounter;
        char[][] board=new char[row][column];

        int bomba=(column/2)*row/4;

        for(i=0;i<this.row;i++){
            for(j=0;j<this.column;j++){
                board[i][j]='-';
                board[i][++j]=' ';
            }
            board[i][--j]='\n';
        }
        for(i=0;i<board.length;i++){
            for(j=0;j<board[i].length;j++){
            }
        }

        for(i=0;i<bomba;i++){
            if(this.row%2==0){
            x=(int)((Math.random()*this.column/1.2));
            y=(int)(Math.random()*this.row);}
            else{
                x=(int)((Math.random()*this.column/1.2));
                y=(int)(Math.random()*this.row);
            }
            if(x%2==1)++x;
            if(board[y][x]!='*'){
                board[y][x]='*';
            }
            else{
                --i;
                continue;
            }
        }

        Scanner input=new Scanner(System.in);

        for(i=0;i<this.row;i++) {
            for (j = 0; j < column; j++) {
                if(board[i][j]=='*')
                    System.out.print('-');
                else{System.out.print(board[i][j]);};
            }
        }

        while(true){
            if(isWin(board,bomba)){
                System.out.println("\n************* C O N G R A T U L A T I O N S    Y O U   W I N  !!! ************* ");
                break;
            }
            bombCounter=0;
            System.out.print("Enter Row Number : ");
            koordinat_y=input.nextInt();
            System.out.print("Enter Column Number : ");
            koordinat_x=input.nextInt();
            for(i=0;i<column*2+10;i++)
            System.out.print("=");
            System.out.println();
            if(koordinat_x<=0||koordinat_x>this.column/2||koordinat_y<=0||koordinat_y>this.row) {
                System.out.println("Please enter values within specified limits ! ");
                print(board,1);
                continue;
            }
            koordinat_x=koordinat_x*2-2;
            if(koordinat_y!=0)
                koordinat_y-=1;
            //8 neighbour control
            if(board[koordinat_y][koordinat_x]=='*'){
                System.out.println("\n##################    G A M E   O V E R !!!!    ##################\n");
                print(board,0);
                break;
            }

            if(koordinat_y==0&&koordinat_x==0){//sol üst
               board=leftTopCorner(board,koordinat_x,koordinat_y,bombCounter);
            continue;
            }

            if(koordinat_y==0&&koordinat_x==column-2){//sağ üst
                board=rightTopCorner(board,koordinat_x,koordinat_y,bombCounter);
                continue;
            }

            if(koordinat_y==row-1&&koordinat_x==0){//sol alt
                board=leftBottomCorner(board,koordinat_x,koordinat_y,bombCounter);
                continue;
            }

            if(koordinat_y==row-1&&koordinat_x==column-2){//sağ alt köşe
                board=rightBottomCorner(board,koordinat_x,koordinat_y,bombCounter);
                continue;
            }

            if(koordinat_y==0){//üst orta
                board=topMiddle(board,koordinat_x,koordinat_y,bombCounter);
                continue;
            }

            if(koordinat_y==row-1){//alt orta
                board=bottomMiddle(board,koordinat_x,koordinat_y,bombCounter);
                continue;
            }

            if(koordinat_x==0){//sol orta
               board=leftMiddle(board,koordinat_x,koordinat_y,bombCounter);
                continue;
            }

            if(koordinat_x==column-2){//sağ orta
                board=rightMiddle(board,koordinat_x,koordinat_y,bombCounter);
                continue;
            }

           board=Middle(board,koordinat_x,koordinat_y,bombCounter);
        }
    }

    char [][] leftTopCorner(char [][] board,int koordinat_x,int koordinat_y,int bombCounter){
        if(board[koordinat_y+1][koordinat_x]=='*')
            ++bombCounter;
        if(board[koordinat_y][koordinat_x+2]=='*')
            ++bombCounter;
        if(board[koordinat_y+1][koordinat_x+2]=='*')
            ++bombCounter;
        board[koordinat_y][koordinat_x]=character(bombCounter);
        print(board,1);
        return board;
    }
    char [][] rightTopCorner(char [][] board,int koordinat_x,int koordinat_y,int bombCounter){
        if(board[koordinat_y][koordinat_x-2]=='*')
            ++bombCounter;
        if(board[koordinat_y+1][koordinat_x-2]=='*')
            ++bombCounter;
        if(board[koordinat_y+1][koordinat_x]=='*')
            ++bombCounter;
        board[koordinat_y][koordinat_x]=character(bombCounter);

        print(board,1);
        return board;
    }
    char [][] leftBottomCorner(char [][] board,int koordinat_x,int koordinat_y,int bombCounter){
        if(board[koordinat_y-1][koordinat_x]=='*')
            ++bombCounter;
        if(board[koordinat_y][koordinat_x+2]=='*')
            ++bombCounter;
        if(board[koordinat_y-1][koordinat_x+2]=='*')
            ++bombCounter;
        board[koordinat_y][koordinat_x]=character(bombCounter);
        print(board,1);
        return board;
    }
    char [][] rightBottomCorner(char [][] board,int koordinat_x,int koordinat_y,int bombCounter){
        if(board[koordinat_y-1][koordinat_x]=='*')
            ++bombCounter;
        if(board[koordinat_y][koordinat_x-2]=='*')
            ++bombCounter;
        if(board[koordinat_y-1][koordinat_x-2]=='*')
            ++bombCounter;
        board[koordinat_y][koordinat_x]=character(bombCounter);
        print(board,1);
        return board;
    }
    char [][] topMiddle(char [][] board,int koordinat_x,int koordinat_y,int bombCounter){
        if(board[koordinat_y+1][koordinat_x]=='*')
            ++bombCounter;
        if(board[koordinat_y][koordinat_x+2]=='*')
            ++bombCounter;
        if(board[koordinat_y][koordinat_x-2]=='*')
            ++bombCounter;
        if(board[koordinat_y+1][koordinat_x+2]=='*')
            ++bombCounter;
        if(board[koordinat_y+1][koordinat_x-2]=='*')
            ++bombCounter;
        board[koordinat_y][koordinat_x]=character(bombCounter);
        print(board,1);
        return board;
    }
    char [][] bottomMiddle(char [][] board,int koordinat_x,int koordinat_y,int bombCounter){
        if(board[koordinat_y][koordinat_x+2]=='*')
            ++bombCounter;
        if(board[koordinat_y][koordinat_x-2]=='*')
            ++bombCounter;
        if(board[koordinat_y-1][koordinat_x]=='*')
            ++bombCounter;
        if(board[koordinat_y-1][koordinat_x+2]=='*')
            ++bombCounter;
        if(board[koordinat_y-1][koordinat_x-2]=='*')
            ++bombCounter;
        board[koordinat_y][koordinat_x]=character(bombCounter);
        print(board,1);
        return board;
    }
    char [][] leftMiddle(char [][] board,int koordinat_x,int koordinat_y,int bombCounter){
        if(board[koordinat_y-1][koordinat_x]=='*')
            ++bombCounter;
        if(board[koordinat_y+1][koordinat_x]=='*')
            ++bombCounter;
        if(board[koordinat_y-1][koordinat_x+2]=='*')
            ++bombCounter;
        if(board[koordinat_y+1][koordinat_x+2]=='*')
            ++bombCounter;
        if(board[koordinat_y][koordinat_x+2]=='*')
            ++bombCounter;
        board[koordinat_y][koordinat_x]=character(bombCounter);
        print(board,1);
        return board;
    }

    char [][]rightMiddle(char [][] board,int koordinat_x,int koordinat_y,int bombCounter){
        if(board[koordinat_y+1][koordinat_x]=='*')
            ++bombCounter;
        if(board[koordinat_y-1][koordinat_x]=='*')
            ++bombCounter;
        if(board[koordinat_y][koordinat_x-2]=='*')
            ++bombCounter;
        if(board[koordinat_y-1][koordinat_x-2]=='*')
            ++bombCounter;
        if(board[koordinat_y+1][koordinat_x-2]=='*')
            ++bombCounter;
        board[koordinat_y][koordinat_x]=character(bombCounter);
        print(board,1);
        return board;
    }
    char [][] Middle(char [][] board,int koordinat_x,int koordinat_y,int bombCounter){
        if(board[koordinat_y+1][koordinat_x]=='*')
            ++bombCounter;
        if(board[koordinat_y+1][koordinat_x-2]=='*')
            ++bombCounter;
        if(board[koordinat_y+1][koordinat_x+2]=='*')
            ++bombCounter;
        if(board[koordinat_y][koordinat_x+2]=='*')
            ++bombCounter;
        if(board[koordinat_y][koordinat_x-2]=='*')
            ++bombCounter;
        if(board[koordinat_y-1][koordinat_x-2]=='*')
            ++bombCounter;
        if(board[koordinat_y-1][koordinat_x+2]=='*')
            ++bombCounter;
        if(board[koordinat_y-1][koordinat_x]=='*')
            ++bombCounter;
        board[koordinat_y][koordinat_x]=character(bombCounter);
        print(board,1);



        return board;
    }


    char character(int number){
        if(number==0) return '0';if(number==1) return '1';
        if(number==2) return '2';if(number==3) return '3';
        if(number==4) return '4';if(number==5) return '5';
        if(number==6) return '6';if(number==7) return '7';
        if(number==8) return '8';if(number==9) return '9';
        return '-';
    }

    void print(char [][] TwoDarray,int number){
        int i,j;
        for(i=0;i<this.row;i++) {
            for (j = 0; j < column; j++) {
                if(number==1) {
                    if (TwoDarray[i][j] == '*')
                        System.out.print('-');
                    else {
                        System.out.print(TwoDarray[i][j]);
                    }
                }
                else{
                    System.out.print(TwoDarray[i][j]);
                }
            }
        }
    }

    boolean isWin(char [][] TwoDarray,int bomb){
        int i,j;
        int sonuc=this.column/2*this.row-bomb;
        for(i=0;i<this.row;i++) {
            for (j = 0; j < column; j++) {
                if(TwoDarray[i][j]=='0'||TwoDarray[i][j]=='1'||TwoDarray[i][j]=='2'||TwoDarray[i][j]=='3'||TwoDarray[i][j]=='4'||TwoDarray[i][j]=='5'||TwoDarray[i][j]=='6'||TwoDarray[i][j]=='7'||TwoDarray[i][j]=='8') {
                    --sonuc;
                }
            }
        if(sonuc==0)
            return true;
        }
        return false;
    }

}
