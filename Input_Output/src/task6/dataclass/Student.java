package task6.dataclass;

import java.io.Serializable;

/**
 * Created by clouway on 10.05.16.
 */
public class Student implements Serializable {
  private String name;
  private int facultyNumber;
  private int gradeMathematics;
  private int gradeInformatics;
  public Student(String name, int facultyNumber, int gradeMathematics, int gradeInformatics){
    this.name=name;
    this.facultyNumber=facultyNumber;
    this.gradeMathematics=gradeMathematics;
    this.gradeInformatics=gradeInformatics;

  }
  public String StudentToString(){
    return "Name: "+this.name+"\n Faculty Number:"+this.facultyNumber+"\n Grade in Mathematics="+gradeInformatics+"\n Grade in Informatics="+this.gradeInformatics;
  }

}
