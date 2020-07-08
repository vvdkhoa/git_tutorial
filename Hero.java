import java.io.Serializable;

public class Hero implements Serializable {
    private String name;
    private int hp;
    Sword sword;
    static int money;
    private int mp;
    private static final long serialVersionUID = 81923983183821L;

    Hero(String name) {
        this.hp = 100;
        this.name = name;
    }

    Hero(String name, int hp, int mp) {
        this.hp = 100;
        this.name = name;
        this.mp = mp;
    }

    Hero () {
        this.name = "ダミー";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        if (name == null) {
            throw new IllegalArgumentException("名前はnullである、処理を中断。");
        }
        if (name.length() <= 1){
            throw new IllegalStateException("名前は短すぎる、処理を中断。");
        }
        if (name.length() <= 8){
            throw new IllegalStateException("名前は長すぎる、処理を中断。");
        }
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int recoverHp){
        this.hp = recoverHp;
    }

    static void setRandomMoney(){
        Hero.money = (int) (Math.random() * 1000);
    }


    void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は、眠って回復した。");
    }

    void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "は、" + sec + "秒座った。");
        System.out.println("HPが" + sec + "ポイント回復した。");
    }

    final void slip() {
        this.hp -= 5;
        System.out.println(this.name + "は、転んだ");
        System.out.println("5のダメージ");
    }

    void run() {
        System.out.println(this.name + "は、逃げ出しました。");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは" + this.hp + "でした。");
    }

    private void die() {
        System.out.println(this.name + "は死んでしまった。");
        System.out.println("GAME OVERです。");
    }

    public void attack(Matango m){
        System.out.println(this.name + "の攻撃");
        this.hp -=2;
        if(this.hp <=0){
            this.die();
        }
    }

    public String toString(){
        return this.name + this.hp + this.mp;
    }



}