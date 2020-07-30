package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.List;

import entities.Comments;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Post p1 = new Post(
				sdf.parse("21/06/2018 13:05:44"),
				"Traveling to New Zealand",
				"I'm going to visit this wonderful country!",
				12);
		//System.out.println(p1);
		
		Post p2 = new Post(
				sdf.parse("28/07/2018 23:14:19"),
				"Good night guys",
				"I'm going to visit this wonderful country!",
				5);
		//System.out.println(p2);
		
		Comments c1 = new Comments("Have a nice trip");
		Comments c2 = new Comments("Wow that's awesome!");
		Comments c3 = new Comments("May the Force be with you");
		
		p1.addComment(c1);
		p1.addComment(c2);
		p2.addComment(c3);
		
		//System.out.println(c1);
		System.out.println(p1);
		System.out.println(p2);
	}

}
