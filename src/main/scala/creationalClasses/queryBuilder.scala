package creationalClasses

/** <h1>trait queryBuilder</h1>
 *
 * This Trait contains all the template values and functions that each
 * query builder should contain.
*/
trait queryBuilder {
    
    val initialString ="";
    /**
     * <H1>def createQuerySection</h1>
     * This functions builds the query section of SELECT/FROM/JOIN/ON/WHERE
     *  
     * @param names: List[Any]) := which contains the COLUMNS/TABLES names
     * @return String := Contains the part of the query XXXXXXXXX 
    */
    def createQuerySection(names: List[Any]) : String = {
        var selectSection = initialString;
        for ((name, index) <- names.zipWithIndex) {
            var name_colmnOrtable = typeOf(name);
            var next_char = if(index < (names.length - 1)) ", " else " ";
            selectSection += name_colmnOrtable + next_char;
        }
        return selectSection;
    }
    /**
     * <H1>def typeOf</h1>
     * This functions 
     *  
     * @param obj : Any := which contains the COLUMNS|TABLES names with|without aliases can be String|Tuple2[String, String]
     * @return String := Contains the part of the query XXXXXXXXX 
    */
    def typeOf(obj: Any): String = obj match {
        case _: String => obj.asInstanceOf[String];
        case _: Tuple2[String, String] => s"${obj.asInstanceOf[Tuple2[String, String]]._1} ${obj.asInstanceOf[Tuple2[String, String]]._2}";
        case _ => "Unknown";
    }
    
}

/** 
 * <h1>class createSelectSection</h1>
 * 
 * 
*/
class createSelectSection extends queryBuilder {
    override val initialString = "SELECT ";
    override def typeOf(obj: Any): String = obj match {
        case _: String => obj.asInstanceOf[String];
        case _: Tuple2[String, String] => s"${obj.asInstanceOf[Tuple2[String, String]]._1} AS ${obj.asInstanceOf[Tuple2[String, String]]._2}";
        case _ => "Unknown";
    }
}

/** 
 * <h1>class createFromSection</h1>
 * 
 * 
*/
class createFromSection extends queryBuilder {
    override val initialString = "FROM ";
}

/** 
 * <h1>class createJoinSection</h1>
 * 
 * 
*/
class createJoinSection extends queryBuilder {
    override val initialString = "JOIN ";
}

/** 
 * <h1>class createOnSection</h1>
 * 
 * 
*/
class createOnSection extends queryBuilder {
    override val initialString = "ON ";
}

/** 
 * <h1>class createWhereSection</h1>
 * 
 * 
*/
class createWhereSection extends queryBuilder {
    override val initialString = "WHERE ";
}


/** <h1>object queryPartSelection</h1>**/
object queryPartSelection {
/** <h1>def apply</h1>
  *
  * This function works as switch case for instantiation of classes.
  *
  * @param queryPart String name of the class to be instanciated
  * 
  * @return Object from the class selected
*/
  def apply(queryPart: String) = queryPart match {
    case "select" => new createSelectSection();
    case "from" => new createFromSection();
    case "join" => new createJoinSection();
    case "on" => new createOnSection();
    case "where" => new createWhereSection();
  }// apply closure
}// queryPartSelection closure