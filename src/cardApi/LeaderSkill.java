package cardApi;

public class LeaderSkill {
    private boolean special_flag;
    private int cost;
    private SkillTarget skillTarget;
    public LeaderSkill(boolean special,int cost,SkillTarget target){
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

    public SkillTarget getSkillTarget() {
        return skillTarget;
    }

    public void setSkillTarget(SkillTarget target) {
        this.skillTarget = target;
    }
}
