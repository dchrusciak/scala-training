package com.scala.training.session1

import java.time.LocalDate


//--------------------------------------------------------------------------------------------------------------------

object S09_CaseClasses {

  case class Employee(id: Long, firstName: String, lastName: String, salary: Float, birthday: LocalDate)

}

//--------------------------------------------------------------------------------------------------------------------

object S09_NormalClass {

  class Employee(val id: Long, val firstName: String, val lastName: String, val salary: Float, val birthday: LocalDate) {

    def canEqual(other: Any): Boolean = other.isInstanceOf[Employee]

    override def equals(other: Any): Boolean = other match {
      case that: Employee =>
        (that canEqual this) &&
          id == that.id &&
          firstName == that.firstName &&
          lastName == that.lastName &&
          salary == that.salary &&
          birthday == that.birthday
      case _ => false
    }

    override def hashCode(): Int = {
      val state = Seq(id, firstName, lastName, salary, birthday)
      state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
    }

    override def toString: String = {
      s"Employee2($id, $firstName, $lastName, $salary, $birthday)"
    }
  }

  object Employee {
    def apply(id: Long, firstName: String, lastName: String, salary: Float, birthday: LocalDate): Employee = {
      new Employee(id, firstName, lastName, salary, birthday)
    }

    def unapply(employee: Employee): Option[(Long, String, String, Float, LocalDate)] = {
      Some((employee.id, employee.firstName, employee.lastName, employee.salary, employee.birthday))
    }
  }

}
