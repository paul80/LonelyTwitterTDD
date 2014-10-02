package ca.ualberta.cs.lonelytwitter.test;


import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.Tweet;
import ca.ualberta.cs.lonelytwitter.data.TweetListModel;
import android.test.ActivityInstrumentationTestCase2;


public class AddTweetTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity>
{

	public AddTweetTest()
	{

		super(LonelyTwitterActivity.class);
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


}
