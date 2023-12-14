public class snake {
    int x, y, width, height;
    void moveLeft (){
        x -= 1;
    if( x<0){
        detectCollison();
    }else{
        System.out.println("Bergerak 1 langkah ke kiri");
    }
    }
    void moveRight(){
        x += 1;
        if(x>width){
            detectCollison();
        }else{
            System.out.println("Bergerak 1 langkah ke kanan");
        }
    }
    void moveUp(){
        y -= 1;
        if(y>height){
            detectCollison();
        }else{
            System.out.println("Bergerak 1 langkah ke atas");
        }
    }
    void moveDown(){
        y+=1;
        if(y<0){
            detectCollison();
        }else{
            System.out.println("Bergerak 1 langkah ke bawah");
        }
    }
    void detectCollison(){
        System.out.print("GAME OVER!\n");
        checkPosition();
    }
    void checkPosition(){
        System.out.printf("Posisi sekarang : (X:%d,Y:%d)\n",x,y);
    }
}