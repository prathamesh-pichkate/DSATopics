import java.util.*;
public class JobSequence {
    static class Job{
        int deadline;
        int profit;
        int id;
        public Job(int i,int d,int p){
            this.id = i;
            this.deadline = d;
            this.profit = p;
        }

        @Override
        public String toString() {
            return "Job{id=" + id + ", deadline=" + deadline + ", profit=" + profit + "}";
        }
    }

    public static void main(String[] args) {
        int jobsInfo[][] = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0;i<jobsInfo.length;i++){
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }

        System.out.println(jobs);

        // Reverse the objects on the basics of profit:
        Collections.sort(jobs,(obj1,obj2)-> obj2.profit-obj1.profit);


        ArrayList<Integer> seq = new ArrayList<>();

        int time = 0;
        for(int i=0;i<jobs.size();i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("The max jobs are:"+ seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }
}
