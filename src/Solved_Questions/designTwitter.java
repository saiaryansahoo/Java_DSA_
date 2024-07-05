package Solved_Questions;

import java.util.*;

public class designTwitter {
    public static void main(String[] args) {
        Twitter twitter = new Twitter();

        twitter.postTweet(1, 5);
        System.out.println(twitter.getNewsFeed(1));

        twitter.follow(1, 2);
        twitter.postTweet(2, 6);
        System.out.println(twitter.getNewsFeed(1));

        twitter.unfollow(1, 2);
        System.out.println(twitter.getNewsFeed(1));
    }
}
class Tweet implements Comparable<Tweet>{
    int time;
    int tweetId;
    public Tweet(int t, int tweetId){
        this.time=t;
        this.tweetId=tweetId;
    }
    public int compareTo(Tweet that){
        return that.time-this.time;
    }
}
class User{
    int userId;
    HashSet<Integer> followers;
    List<Tweet> tweets;
    public User(int userId){
        this.userId=userId;
        followers=new HashSet<>();
        tweets=new LinkedList<>();
    }
    public void addTweet(Tweet t){
        tweets.add(0,t);
    }
    public void addFollower(int followeeId){
        followers.add(followeeId);
    }
    public void removeFollower(int followeeId){
        followers.remove(followeeId);
    }
}

class Twitter {
    HashMap <Integer, User> userMap=new HashMap<>();
    int timeCounter;
    public Twitter() {
        userMap=new HashMap<>();
        timeCounter=0;
    }

    public void postTweet(int userId, int tweetId) {
        timeCounter++;
        if(!userMap.containsKey(userId)){
            userMap.put(userId,new User(userId));
        }
        User user = userMap.get(userId);
        user.addTweet(new Tweet(timeCounter, tweetId));
    }

    public List<Integer> getNewsFeed(int userId) {
        if(!userMap.containsKey(userId)) return new ArrayList<>();

        PriorityQueue<Tweet> pq=new PriorityQueue<>();

        User user=userMap.get(userId);

        int count=0;
        for (int followerId:user.followers) {
            for(Tweet tweet:userMap.get(followerId).tweets) {
                pq.add(tweet);
                count++;
                if(count>10){
                    break;
                }
            }
        }
        for(Tweet tweet:user.tweets) {
            pq.add(tweet);
            count++;
            if(count>10){
                break;
            }
        }
        List<Integer> result=new ArrayList<>();
        int idx=0;
        while(!pq.isEmpty() && count<10){
            Tweet tweet=pq.remove();
            result.add(tweet.tweetId);
            idx++;
        }
        return result;
    }

    public void follow(int followerId, int followeeId) {
        if(!userMap.containsKey(followerId)){
            userMap.put(followerId,new User(followerId));
        }
        if(!userMap.containsKey(followeeId)){
            userMap.put(followeeId,new User(followeeId));
        }
        User user=userMap.get(followerId);
        user.addFollower(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if(!userMap.containsKey(followerId)) return;

        if(!userMap.containsKey(followeeId)) return;

        User user = userMap.get(followerId);
        user.removeFollower(followeeId);
    }
}