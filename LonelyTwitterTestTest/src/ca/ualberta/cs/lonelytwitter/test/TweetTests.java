package ca.ualberta.cs.lonelytwitter.test;

import java.util.ArrayList;

import ca.ualberta.cs.lonelytwitter.AbstractTweet;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.Tweet;
import ca.ualberta.cs.lonelytwitter.data.TweetListModel;
import android.test.ActivityInstrumentationTestCase2;


public class TweetTests extends ActivityInstrumentationTestCase2<LonelyTwitterActivity>
{
	public TweetTests()
	{

		super(LonelyTwitterActivity.class);
		// TODO Auto-generated constructor stub
	}

	public void testAddTweet() {
		Tweet t= new Tweet("Hello");
		TweetListModel tweets= new TweetListModel();
		tweets.addTweet(t);
		assertTrue("A tweet is in tweets", tweets.getCount()==1);
		Tweet t2= new Tweet("Hello");
		tweets.addTweet(t2);
		
		assertTrue("No new tweet in here", tweets.getCount()==1);
	}
	
	public void testCountTweets() {
		Tweet t= new Tweet("first");
		Tweet t2= new Tweet("second");
		Tweet t3= new Tweet("third");
		
		TweetListModel tweets= new TweetListModel();

		
		tweets.addTweet(t);
		tweets.addTweet(t2);
		tweets.addTweet(t3);
		
		assertEquals("Size is 3", tweets.getCount(), 3);
	}
	
	public void testHasTweet() {
		Tweet t= new Tweet("Hello");
		TweetListModel tweets = new TweetListModel();
		tweets.addTweet(t);
		
		assertTrue("Tweet list contains tweet", tweets.hasTweet(t));
	}
	
	public void testRemoveTweet() {
		Tweet t= new Tweet("Hello");
		TweetListModel tweets= new TweetListModel();
		tweets.addTweet(t);
		assertTrue("A tweet is in tweets", tweets.getCount()==1);
		tweets.removeTweet(t);
		assertEquals("Size is 0", tweets.getCount(), 0);

	}
	
	public void testgetTweets(){
		Tweet t= new Tweet("Hello");
		TweetListModel tweets= new TweetListModel();
		tweets.addTweet(t);
		
		ArrayList <AbstractTweet> newtweets= tweets.getTweets();
		assertTrue("A tweet is in tweets", tweets.getCount()==1);
		assertTrue("A tweet is in the second tweet list",newtweets.size()==1);
	}


}

