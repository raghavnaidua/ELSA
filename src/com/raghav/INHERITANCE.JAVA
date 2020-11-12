package com.raghav;


class Teacher {
    String designation = "Teacher";
    String collegeName = "Beginnersbook";
    void does(){
        System.out.println("Teaching");
    }
}

class PhysicsTeacher extends Teacher {
    String mainSubject = "Physics";
}

