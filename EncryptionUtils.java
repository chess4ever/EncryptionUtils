import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

public class EncryptionUtils{
	public static void main(String... args){
		if(args.length!=1){
			System.out.println("expecting exactly one argument as password!");
			return;
		}
		System.out.println("encrypted password:\n"+Base64.encodeBase64String(DigestUtils.sha512(args[0])));
	}
}
