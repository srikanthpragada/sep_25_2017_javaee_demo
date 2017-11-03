package jaxws;

public class JobsClient {

	public static void main(String[] args) throws Exception {

		JobsServiceProxy proxy = new JobsServiceProxy();
		System.out.println(proxy.getJobTitle("IT_PROG"));

//		Job[] jobs = proxy.getJobs();
//
//		for (Job job : jobs)
//			System.out.println(job.getTitle());

		Job[] jobs2 = proxy.searchJobs("Manager");

		for (Job job : jobs2)
			System.out.println(job.getTitle());

	}

}
