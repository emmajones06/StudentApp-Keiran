import kotlin.collections.mutableListOf

class University(var students: MutableList<Student>) {

    fun enrolStudent(student: Student) {
        students.add(student)
    }

    fun findStudentByID(studentID: Int) : Student?{
        for (student in this.students){
            if (student.id == studentID){
                return student
            }
        }
        return null
    }

    fun findStudentsByName(name: String) : MutableList<Student>{
        var matchingStudents = mutableListOf<Student>()
        for (student in this.students){
            if (student.name == name){
                matchingStudents.add(student)
            }
        }
        return matchingStudents
    }
}