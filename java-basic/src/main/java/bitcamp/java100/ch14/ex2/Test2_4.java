package bitcamp.java100.ch14.ex2;

public class Test2_4 {
	public static void main(String[] args) throws Exception {
		
		// 데이터 준비
		// => 랜덤 메서드 사용 (400만개)
		byte[] data = new byte[4000000];
		for(int i = 0; i < data.length; i++) {
			data[i] = (byte)(Math.random() * 255);
		}
		
		MyBufferedOutputStream out = new MybufferdOutputStream("./test2.dat");
		
		long start = System.currentTimeMillis();
		
		int len = 0;
		for(int b : data) {
			out.write(b);
		}
		out.flush();
		long end = System.currentTimeMillis();

		System.out.printf("걸린 시간 = %d\n", end - start);
		
		out.close();
	}
}
