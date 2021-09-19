import java.io.File;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

public class UploadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final AmazonS3 s3 =AmazonS3ClientBuilder.standard().withRegion(Regions.DEFAULT_REGION).build();
		String bucket_name="parvaizs3";
		String Key_name ="parr.png";
		String file_path="C:\\Users\\Parva\\OneDrive\\Desktop\\IDE Eecutes\\JAVA\\fffff.png";
		try {
			s3.putObject(bucket_name,Key_name,new File(file_path));
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
			System.exit(1);
		}
	}

}
