package controllers

import play.api.mvc.{Action, Controller}
import play.api.http.MimeTypes
import play.api.libs.json.Json

object Application extends Controller {

  def index = Action {
    Ok(views.html.Index())
  }

  def ping = Action {
    Ok(Json.obj("alive" -> true))
  }
  
}
