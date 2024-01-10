package Enkapsulasi.latihan2;

public class bus {
    private int penumpang;
    private int maxPenumpang;

    //konstruktor
    public bus(int maxPenumpang){
        this.maxPenumpang=maxPenumpang;
        penumpang = 0;
    }

    ///method mutator
    public void pluspenumpang(int penumpang){
        int temp;
        temp=this.penumpang+penumpang;
        if(temp>=maxPenumpang){
            System.out.println("overload penumpang");
        }
        else{
            this.penumpang=temp;
        }

    }
    public void cetak(){
        System.out.println("penumpang sekarang= "+penumpang);
        System.out.println("penumpang seharusnya adalah ="+maxPenumpang);
    }
}
