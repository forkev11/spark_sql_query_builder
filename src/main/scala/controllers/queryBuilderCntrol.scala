package controllers
/** <h1>Class queryBuilderCntrol</h1>
 *
 * 
*/
class queryBuilderCntrol {

  /**
     * <H1>def create_Select_Section</h1>
     * This functions that builds the query section of SELECT
     *  
     * @param column_names: List[Any]) := which contains the columns names
     * @return String := Contains the part of the query SELECT XXXXXXXXX .... 
  */
  def create_Select_Section(column_names: List[Any]) : String = {
    var selectSection ="SELECT ";
    for ((name, index) <- column_names.zipWithIndex) {
      var column = typeOf(name);
      var next_char = if(index < (column_names.length - 1)) ", " else " ";
      selectSection += column + next_char;
    }
    return selectSection;
  }

  def typeOf(obj: Any): String = obj match {
    case _: String => obj.asInstanceOf[String];
    case _: Tuple2[String, String] => s"${obj.asInstanceOf[Tuple2[String, String]]._1} AS ${obj.asInstanceOf[Tuple2[String, String]]._2}";
    case _ => "Unknown";
  }
   /**
     * <H1>def create_From_Section</h1>
     * This functions that builds the query section of SELECT
     *  
     * @param column_names: List[Any]) := which contains the columns names
     * @return String := Contains the part of the query SELECT XXXXXXXXX .... 
  */
  def create_From_Section(column_names: List[Any]){

  }

  def create_Join_Section(){

  }

  def create_Where_ON_Section(){

  }

  def validate_query(){

  }
  def build_query(){

  }
}
