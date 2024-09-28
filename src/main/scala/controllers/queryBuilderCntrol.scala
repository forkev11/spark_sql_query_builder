package controllers

import creationalClasses.queryPartSelection

/** <h1>Class queryBuilderCntrol</h1>
 *
 * 
*/
class queryBuilderCntrol {

  def validate_query_sequence(queryKeys : List [String], next_key : String){

  }

  /**
     * <H1>def build_query</h1>
     * This functions builds the query section of SELECT/FROM/JOIN/ON/WHERE
     *  
     * @param names: List[Any]) := which contains the COLUMNS/TABLES names
     * @return String := Contains the part of the query XXXXXXXXX 
  */
  def build_query(queryMap2Build : Map[String, List[Any]]): String = {
    try {
      var queryString : String = ""; 
      for (keyQuery <- queryMap2Build.keys){
        val queryPartObj = queryPartSelection(keyQuery);
        queryString += queryPartObj.createQuerySection(queryMap2Build(keyQuery));
      }
      return queryString;
    } catch {
      case ex: Exception => { println(s"Error at build_query function :  ${ex}"); return ""; }
    }
  }//build_query function closure

}//queryBuilderCntrol class closure 
