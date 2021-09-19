
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

public class createBucket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final AmazonS3 s3 =AmazonS3ClientBuilder.standard().withRegion(Regions.DEFAULT_REGION).build();
		String bucket_name="thirdeyepics";
		try {
			s3.createBucket(bucket_name);
			System.out.println("bucket created");
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
	}

}
