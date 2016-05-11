console.log('The replier bot is starting');
 
var Twit = require('twit');
 
var config = require('./config5');
var T = new Twit(config);
 
 
//Setting up a user stream
var stream = T.stream('user');
 
//Anytime someone follows me
stream.on('tweet', tweetEvent);
 
function tweetEvent(eventMsg) {
   
 
    // var fs = require('fs');
    // var json = JSON.stringify(eventMsg,null,2);
    // fs.writeFile("tweet.json", json);
 
    var replyto = eventMsg.id_str;
    var text = eventMsg.text;
    var from = eventMsg.user.screen_name;
 
    
 
    //We utilize 'from !=='' as otherwise we would infinitely spam our own account. Replies are sent to retweets as well as tweets. 
    if (from !== 'roflbrowhy' && from  === 'markym') {
    var newTweet = '@' +  from + ' A NEW MESSAGE FOR SPECIFIC USER ' + Math.random().toFixed(4);
    tweetIt(replyto, newTweet);
    } else if (from !== 'roflbrowhy' && from === 'rofl'){
    var newTweet = '@' +  from + ' MESSAGE FOR SPECIFIC USER ' + Math.random().toFixed(4);
    tweetIt(replyto, newTweet);
    } 
}

 
function tweetIt(replyto, txt) {
 
   
    var tweet = {
    status: txt,
    in_reply_to_status_id: replyto
    }
 
    T.post('statuses/update', tweet, tweeted);
 
    function tweeted(err, data, response) {
        if (err) {
            console.log("Something went wrong!");
        } else {
            console.log("It worked!");
        }
       
    }
}