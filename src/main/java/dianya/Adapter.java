package dianya;

public class Adapter implements DianYa5 {
    private  DC220 dc220;

    public Adapter(DC220 dc220){
        this.dc220=dc220;
    }
    @Override
    public int output() {
        //适配器处理能够匹配的过程
        int input=dc220.output220();
        int output=input/44;
        System.out.println("使用适配器输入:"+input+"v,输出:"+output+"v");
        return output;
    }
}
