package invitation;

import org.hashids.*;

import java.util.Arrays;


/**
 * 邀请码工具类
 */
public class InvitationCodeUtil {
    private static Hashids hashids = new Hashids("WKPT Invitation Code");

    /**
     * 产生随机唯一的邀请码
     * 唯一：用户id作为后缀
     * 随机：前缀是随机8位数
     * @return
     */
    public static String generateCode(long id){
        long prefix = (long) (Math.random()*100000000);
        String code = hashids.encode(prefix, id);
        return code;
    }

    /**
     * 从邀请码中获取ID，方便数据库操作
     * @return
     */
    public static long deCode(String code){

//        Hashids hashids = new Hashids("WKPT Invitation Code");
        long numbers[] = hashids.decode(code);

        try {
            return numbers[1];
        }catch (ArrayIndexOutOfBoundsException e) {
            //防止无效验证码
            System.out.println(e.toString());
            return -1;
        }
    }
}
