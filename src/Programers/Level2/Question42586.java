package Programers.Level2;

import java.util.Arrays;

public class Question42586 {
    public static void main(String[] args){
        Question42586 q = new Question42586();
        int[] result = q.solution(new int[]{93,30,55},new int[]{1,30,5});
    }
    public int[] solution(int[] progresses, int[] speeds){
        int[] answer = {};
        int index = 0;
        int chkPublish = 0;
        JobQueue jobQueue = new JobQueue(progresses,speeds);
        System.out.println(jobQueue);

        while(jobQueue.getFirst() != null){
            jobQueue.progressJob();
            chkPublish = jobQueue.chkPublish();

            if( chkPublish > 0){
                int[] temp = answer;
                answer = new int[answer.length +1];

                for(int i = 0; i<answer.length; i++){
                    if(i < temp.length){
                        answer[i] = temp[i];
                    }else{
                        answer[i] = chkPublish;
                    }
                }
            }
        }

        return answer;
    }
}

class Job{
    int progress;
    int speeds;

    public Job(int progress,int speeds){
        this.progress = progress;
        this.speeds = speeds;
    }

    @Override
    public String toString() {
        return "Job{" +
                "progress=" + progress +
                ", speeds=" + speeds +
                '}';
    }

    public void progressJob() {
        this.progress += this.speeds;
    }

    public int getProgress() {
        return this.progress;
    }
}

class JobQueue{
    int first = 0;
    int last = -1;
    Job[] jobList;

    public JobQueue(int[] progresses, int[] speeds){
        this.jobList = new Job[progresses.length];
        for(int i = 0; i<progresses.length; i++){
            this.last++;
            jobList[i] = new Job(progresses[i],speeds[i]);
        }
    }

    void progressJob(){
        for(Job job : jobList){
            if(job != null) job.progressJob();
        }
    }

    int chkPublish(){
        int result = 0;
        while(jobList[first] != null){
            if(jobList[first].getProgress() >= 100){
                publishJob();
                result++;
            }else{
                break;
            }
        }
        return result;
    }

    void publishJob(){
        for(int i = 1; i<jobList.length; i++){
            jobList[i-1] = jobList[i];
            jobList[i] = null;
            last--;
        }
    }

    @Override
    public String toString() {
        return "JobList{" +
                "first=" + first +
                ", last=" + last +
                ", jobList=" + Arrays.toString(jobList) +
                '}';
    }

    public Job getFirst() {
        return this.jobList[first];
    }
}
