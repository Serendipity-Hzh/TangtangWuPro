package ttangwu.framework.util;

import java.util.UUID;
//生成UUID 以便于添加 商品的种类 结合商品目录
public class UUID_gennerate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		System.out.println(uuid);

	}

}
