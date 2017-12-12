package main;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class Main {

	public static void main(String[] args) throws TwitterException {
		//Your Twitter App's Consumer Key
	    String consumerKey = "gkjxhNkwWiK8spfoq8ckIvecY";

	    //Your Twitter App's Consumer Secret
	    String consumerSecret = "XD8gO2JHcWq50dKx2b1hoYLrjIewbtqON0BSLwkNf5MykjiBOf";

	    //Your Twitter Access Token
	    String accessToken = "137610790-c1TuZgsavB6qhzeGPJscYq2MxmhL9GphbQKdX3Ye";

	    //Your Twitter Access Token Secret
	    String accessTokenSecret = "lAocpX69L75qwIpVPYhGwTrquih5GIvNSfY2xK8gGpjVB";
	    
	    
	    TwitterFactory twitterFactory = new TwitterFactory();

	    //Instantiate a new Twitter instance
	    Twitter twitter1 = twitterFactory.getInstance();

	    //setup OAuth Consumer Credentials
	   // twitter.setOAuth
	    twitter1.setOAuthConsumer (consumerKey,consumerSecret);

	    //setup OAuth Access Token
	    twitter1.setOAuthAccessToken(new AccessToken(accessToken, accessTokenSecret));
	    
	    
	    
	    
	    
	    
	    
		Status status = twitter1.updateStatus("blablabla");
	    System.out.println("Successfully updated the status to [" + status.getText() + "].");
	}

}
