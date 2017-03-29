
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object eventTicket_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

     object eventTicket_Scope1 {
import helper._

class eventTicket extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[models.Ticket],List[models.Event],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(eventTicket: List[models.Ticket], events: List[models.Event]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.64*/("""

"""),_display_(/*5.2*/main("Welcome to Play")/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""
    """),format.raw/*6.5*/("""<!--..CONTENT..-->
    <div class="container" id = "seatingplans">
        <div class="row well">
		  <div class="col-lg-5 col-md-5 col-sm-6 col-xs-12">
		    <img src="http://placehold.it/400x250/000/fff" alt="">
		  </div>
		  
		  <div class="col-lg-7 col-md-7 col-sm-6 col-xs-12" id = "eventInfo">
		    <h1>Event name</h1>
			<p>Location here : </p>
			<p>Date/time here : </p>
			<p>Description here : </p>
		  </div>
		  </div>
		  
		  <div class="row well" id="seating">
            <div class="col-lg-8 col-md-8 col-sm-6 col-xs-12">
                <img src="assets/img/seatingplan.png" class="img-responsive" alt="seatingplan">
            </div>
            <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" id = "seatingform">
            <h2 class = "text-center greentext">Choose your Tickets</h2>
                <div class="form-group">
                    <label for="seat">Seating Block</label>
                    <select class="form-control" id = "seatingselect">
                        <option>A €50.00</option>
                        <option>B</option>
                        <option>C</option>
                        <option>D</option>
                        <option>E</option>
                        <option>F</option>
                        <option>G</option>
                        <option>H</option>
                        <option>I</option>
                        <option>J</option>
                        <option>K</option>
                        <option>L</option>
                        <option>M</option>
                        <option>N</option>
                        <option>O</option>
                        <option>P</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="quantity">Quantity</label>
                    <input type="number" name="quantiy" value="0" min="1" max="99" step="1">
                </div>

                 <div class="form-group">
                   
                    <input type="submit" class = "form-control btn-success" value = "Add To Cart">
                </div>
            </div>
        </div>

          <div class="row well" id="tickets">
            <div class="col-lg-8 col-md-8 col-sm-6 col-xs-12">
                <div class="row">
                    <h1>  </h1>
                    <a href=""""),_display_(/*64.31*/routes/*64.37*/.HomeController.addTicket()),format.raw/*64.64*/("""" class="btn btn-success btn-lg round">Add ticket</a>
                    <br>
                    <br>
                    <strong>Display</strong>

                    <div class="btn-group">
                        <a href="#" id="list" class="btn btn-default btn-sm"><span class="glyphicon glyphicon-th-list">
                        </span>List</a> <a href="#" id="grid" class="btn btn-default btn-sm"><span
                    class="glyphicon glyphicon-th"></span>Grid</a>
                    </div>
                </div>
                <br>

            <div id="products" class="row list-group">
                        <!-- Start of for loop - Fo reach e in events add a row -->
                    """),_display_(/*79.22*/for(t <- eventTicket) yield /*79.43*/ {_display_(Seq[Any](format.raw/*79.45*/("""
                            """),format.raw/*80.29*/("""<div class="item  col-xs-4 col-lg-4">
                                <div class="thumbnail">

                                    <img class="group list-group-image" src="http://placehold.it/400x250/000/fff" alt="" >
                                    <div class="caption">    
                                        <p class="group inner list-group-item-text">
                                            """),_display_(/*86.46*/t/*86.47*/.getTicketType),format.raw/*86.61*/("""
                                            """),_display_(/*87.46*/t/*87.47*/.getPrice),format.raw/*87.56*/("""
                                           
                                        """),format.raw/*89.41*/("""</p>
                                        <div class="row">
                                            <div class="col-xs-12 col-md-6">
                                           

                                                <a href=""""),_display_(/*94.59*/routes/*94.65*/.HomeController.deleteTicket(t.getTicketID)),format.raw/*94.108*/("""" class = "btn-xs btn-danger"
                                                onclick="return confirmDel();">
                                                    <span class="glyphicon glyphicon-trash"></span>
                                                </a>
                                            </div>


                                        </div>
                                    </div>
                                </div>
                            </div>

                    """)))}),format.raw/*106.22*/(""" """),format.raw/*106.23*/("""<!-- End of for loop -->

            </div>
            </div>
        </div>

   <script>
        function confirmDel()"""),format.raw/*113.30*/("""{"""),format.raw/*113.31*/("""
            """),format.raw/*114.13*/("""return confirm('Are you sure?');
        """),format.raw/*115.9*/("""}"""),format.raw/*115.10*/("""
    """),format.raw/*116.5*/("""</script>

        <!--END CONTENT-->
       """)))}))
      }
    }
  }

  def render(eventTicket:List[models.Ticket],events:List[models.Event]): play.twirl.api.HtmlFormat.Appendable = apply(eventTicket,events)

  def f:((List[models.Ticket],List[models.Event]) => play.twirl.api.HtmlFormat.Appendable) = (eventTicket,events) => apply(eventTicket,events)

  def ref: this.type = this

}


}
}

/**/
object eventTicket extends eventTicket_Scope0.eventTicket_Scope1.eventTicket
              /*
                  -- GENERATED --
                  DATE: Wed Mar 29 14:47:07 BST 2017
                  SOURCE: C:/Users/Jay/Desktop/TicketStore - Copy/app/views/eventTicket.scala.html
                  HASH: 7160a12aa56b20741fb24cb6856823ef033d6b66
                  MATRIX: 839->21|996->83|1026->88|1057->111|1096->113|1128->119|3587->2551|3602->2557|3650->2584|4404->3311|4441->3332|4481->3334|4539->3364|4982->3780|4992->3781|5027->3795|5101->3842|5111->3843|5141->3852|5256->3939|5531->4187|5546->4193|5611->4236|6157->4750|6187->4751|6344->4879|6374->4880|6417->4894|6487->4936|6517->4937|6551->4943
                  LINES: 30->3|35->3|37->5|37->5|37->5|38->6|96->64|96->64|96->64|111->79|111->79|111->79|112->80|118->86|118->86|118->86|119->87|119->87|119->87|121->89|126->94|126->94|126->94|138->106|138->106|145->113|145->113|146->114|147->115|147->115|148->116
                  -- GENERATED --
              */
          