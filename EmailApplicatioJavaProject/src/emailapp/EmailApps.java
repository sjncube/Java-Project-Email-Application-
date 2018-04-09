package emailapp;

import java.nio.channels.Pipe.SourceChannel;

public class EmailApps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Email email1 = new Email("Sizwe","ncube");
		
		System.out.println(email1.getInfo());
	}
}
