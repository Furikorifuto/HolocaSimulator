package cardApi;

public class LeaderSkill {
    private boolean special_flag;
    private int cost;
    private EnumSkillTarget skillTarget;
    public LeaderSkill(boolean special, int cost, EnumSkillTarget target){
        this.setSpecial(special);
        this.setCost(cost);
        this.setSkillTarget(target);
    }
    public boolean isSpecial() {
        return special_flag;
    }

    public void setSpecial(boolean special) {
        this.special_flag = special;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public EnumSkillTarget getSkillTarget() {
        return skillTarget;
    }

    public void setSkillTarget(EnumSkillTarget target) {
        this.skillTarget = target;
    }
}
