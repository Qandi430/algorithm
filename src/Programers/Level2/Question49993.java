package Programers.Level2;

public class Question49993 {
    public static void main(String[] args){
//        System.out.println(solution("CBD",new String[]{"CB", "CD", "BC", "CBD"}));
        System.out.println(solution("CBD",new String[]{"BACDE", "CBADF", "AECB", "BDA"}));
    }
    public static int solution(String skill, String[] skill_trees){
        int answer = 0;
        int prev;
        boolean isUse;
        int current;
        String[] skills = skill.split("");

        for(int i = 0; i<skill_trees.length; i++){
            prev = -1;
            isUse = true;
            System.out.println("======================"+i+"=======================");
            for(int j = 0; j<skills.length; j++){
                current = skill_trees[i].indexOf(skills[j]);
                if(current > -1){
                    if(j==0){
                        prev = current;
                    }else{
                        if(prev == -1){
                            isUse = false;
                            break;
                        }else{
                            if(prev < current){
                                if(skill.indexOf(skill_trees[i].charAt(prev))+1 == skill.indexOf(skill_trees[i].charAt(current))){
                                    prev = current;
                                }else {
                                    isUse = false;
                                    break;
                                }
                            }else{
                                isUse = false;
                                break;
                            }
                        }
                    }
                }
            }
            System.out.println(isUse);
            if(isUse) answer++;
        }
        return answer;
    }
}
