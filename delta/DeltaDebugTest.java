https://tutorcs.com
WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
/*
 * Copyright Â© 2021 Georgia Institute of Technology (Georgia Tech). All Rights Reserved.
 * Template code for CS 6340 Software Analysis
 * Instructors: Mayur Naik and Chris Poch
 * Head TAs: Kelly Parks and Joel Cooper
 *
 * Georgia Tech asserts copyright ownership of this template and all derivative
 * works, including solutions to the projects assigned in this course. Students
 * and other users of this template code are advised not to share it with others
 * or to make it available on publicly viewable websites including repositories
 * such as GitHub and GitLab. This copyright statement should not be removed
 * or edited. Removing it will be considered an academic integrity issue.
 *
 * We do grant permission to share solutions privately with non-students such
 * as potential employers as long as this header remains in full. However, 
 * sharing with other current or future students or using a medium to share
 * where the code is widely available on the internet is prohibited and 
 * subject to being investigated as a GT honor code violation.
 * Please respect the intellectual ownership of the course materials 
 * (including exam keys, project requirements, etc.) and do not distribute them 
 * to anyone not enrolled in the class. Use of any previous semester course 
 * materials, such as tests, quizzes, homework, projects, videos, and any other 
 * coursework, is prohibited in this course. */
 
public class DeltaDebugTest {

	public static void main(String[] args) {
		DeltaDebug dd = new DeltaDebug();
        /**
         * Parameters for deltaDebug method
         * @param char_granularity - if false, use line granularity for the algorithm
         * @param program - the path of the program you're testing, e.g. "./SecretCoder"
         * @param failing_file - path of provided failing input file, e.g. "./input_file.txt"
         * @param error_msg - the program output that Delta should treat as an error, e.g. "java.lang.ArrayIndexOutOfBoundsException"
         * @param final_minimized_file - path to write minimized output file to  
         */	
		dd.deltaDebug(true, "./SecretCoder", "long_failing_text.txt", "java.lang.ArrayIndexOutOfBoundsException", "my_min_failing_text.txt");
   	}
}
