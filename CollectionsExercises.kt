/*
 * Created by Mark Hozan
 * Exercise: Practice using for Meta Android Developer course
 * 2026
 */
class Comment(val userId: Int, var message: String)
val comment1: Comment = Comment(5241, "Nice Code")
val comment2: Comment = Comment(6624, "Like it")
val comment3: Comment = Comment(5224, "What's going on?")
val comment4: Comment = Comment(9001, "Check out my website")
val comment5: Comment = Comment(8818, "Hello everyone, :)")
var comments = listOf<Comment>(
	comment1,
    comment2, 
    comment3,
    comment4, comment5
)

var blockedUserIds = setOf<Int>(
	5224,
    9001
)

var userIdToRelation = mapOf<Int, String>(5241 to "Friend", 6624 to "Work Colleague")

fun main(){
    for(comment in comments){
        if(comment.userId !in blockedUserIds){
            println("Comment: " + comment.message + " ; From: " + userIdToRelation[comment.userId])
            println()
        }
    }
}

/*********************************
 * Returns
 * 	Comment: Nice Code ; From: Friend

	Comment: Like it ; From: Work Colleague

	Comment: Hello everyone, :) ; From: null
    
    */