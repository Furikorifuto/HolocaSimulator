package cardApi;

public enum MemberSkillCost {
    Any1(MemberSkillColor.Any),
    Any2(MemberSkillColor.Any, MemberSkillColor.Any);

    MemberSkillCost(MemberSkillColor cost) {

    }
    MemberSkillCost(MemberSkillColor cost1, MemberSkillColor cost2) {

    }
    MemberSkillCost(MemberSkillColor cost1, MemberSkillColor cost2, MemberSkillColor cost3) {

    }
    MemberSkillCost(MemberSkillColor cost1, MemberSkillColor cost2, MemberSkillColor cost3, MemberSkillColor cost4) {

    }
}
