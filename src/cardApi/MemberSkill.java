package cardApi;

public class MemberSkill {
    private String skillName;
    private int baseArts;
    private EnumCostTable costTable;
    private EnumSkillExtra skillExtra;

    public MemberSkill(String name,int arts,EnumCostTable cost){
        this.setSkillName(name);
        this.setBaseArts(arts);
        this.setCostTable(cost);
    }
    public MemberSkill(String name,int arts,EnumCostTable cost,EnumSkillExtra extra){
        this.setSkillName(name);
        this.setBaseArts(arts);
        this.setCostTable(cost);
        this.setSkillExtra(extra);
    }
    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String name) {
        this.skillName = name;
    }

    public int getBaseArts() {
        return baseArts;
    }

    public void setBaseArts(int arts) {
        this.baseArts = arts;
    }

    public EnumCostTable getCostTable() {
        return costTable;
    }

    public void setCostTable(EnumCostTable cost) {
        this.costTable = cost;
    }

    public EnumSkillExtra getSkillExtra() {
        return skillExtra;
    }

    public void setSkillExtra(EnumSkillExtra extra) {
        this.skillExtra = extra;
    }
}
