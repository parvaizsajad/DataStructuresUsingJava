

import java.util.List;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;

public class ListOfBuckets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final AmazonS3 s3 =AmazonS3ClientBuilder.standard().withRegion(Regions.DEFAULT_REGION).build();
		List<Bucket> buckets=s3.listBuckets();
		System.out.println("your s3 buckets are: ");
		for(Bucket b: buckets){
			System.out.println("* "+ b.getName());
		}
	}

}
