package JobPrj;

public class Job implements JbInter{
    //Properties
    //id, profile, desc, technology
    private int id;
    private String profile;
/*    private String desc;*/
    private String techlg;
    private String yrsExp;
    public Job(int id, String profile,/* String desc,*/ String techlg, String yrsExp){
        this.id = id;
        this.profile = profile;
       /* this.desc = desc;*/
        this.techlg = techlg;
        this.yrsExp = yrsExp;
    }
    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getProfile() {
        return profile;
    }


    public String getYrsExp() {
        return yrsExp;
    }

    /*public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }*/
    @Override
    public String getTechlg() {
        return techlg;
    }

    @Override
    public String toString(){
        return "Your id: "+getId()+", the profile is: "+getProfile()+", and the technology needed is : "+getTechlg()+" is there any years of experience required or it is a Fresher "+getYrsExp();
    }

}
