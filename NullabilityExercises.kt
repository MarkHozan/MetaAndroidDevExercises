/*
 * Created by Mark Hozan
 * Exercise: Practice handling nullability for Meta Android Developer course
 * 2026
 */
import java.util.Scanner

val scanner = Scanner(System.`in`)

class Student(val Id: Int, val name: String, val grade: Double)
val alex = Student(123, "alex", 92.0)
val bob = Student(456, "bob", 73.0)
val studentList = listOf(alex, bob)

fun getStudentById(Id: Int): Student?{
    for(student in studentList){
        if (student.Id == Id){
            return student
        }
    }
    return null
}

// Nullable
fun searchInStudents(name: String?): Student?{
    for(student in studentList){
        if (student.name == name){
            return student
        }
    }
    return null
}

fun main(){
  val student123 = getStudentById(123)
  println(student123)
  println(searchInStudents("Bob")) //Incorrect spelling
  println(searchInStudents("bob")) //correct spelling
  
  print("insert a name you'd like to search for in the student list: ")
  val nameSearch = scanner.nextLine()
  println(searchInStudents(nameSearch))
  
  
}

/**********************
    Returns:
    	Student@3f99bd52
		null
		Student@65b54208 
        insert a name you'd like to search for in the student list: {alex}
		{Student@b1bc7ed}
        */