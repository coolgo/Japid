package templates;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import japidviews._layouts.*;
import japidviews._tags.*;
import cn.bran.Post;
import static cn.bran.play.PlayTemplateVarsAdapter.*;
// NOTE: This file was generated from: templates/Posts.html
// Change to this file will be lost next time the template file is compiled.
@cn.bran.play.NoEnhance
public class Posts extends cn.bran.japid.template.JapidTemplateBase{
	public static final String sourceTemplate = "templates/Posts.html";
	public static final String contentType = "text/html";
static String static_0 = ""
;
static String static_1 = "\n" + 
"";
static String static_2 = "\n" + 
"\n" + 
"";
static String static_3 = " \n" + 
"	- title: "
;
static String static_4 = "\n" + 
"	- date: "
;
static String static_5 = "\n" + 
"	- author "
;
static String static_6 = " "
;
static String static_7 = "\n" + 
"	the real title: 你好\n" + 
"";
static String static_8 = "\n" + 
"";
	public Posts(StringBuilder out) {
		super(out);
	}
	String blogTitle;
	List <Post> allPost;
	public cn.bran.japid.template.RenderResult render(
  String blogTitle, 
  List <Post> allPost
) {
		this.blogTitle = blogTitle;
		this.allPost = allPost;
		long t = -1;
		super.layout();
		return new cn.bran.japid.template.RenderResult(this.contentType, getOut(), t);
	}
	@Override protected void doLayout() {
p(static_0);// line 1

p(static_1);// line 3
p(static_2);// line 7
for (Post post: allPost) {// line 9
p(static_3);// line 9
p(post.title);// line 10
p(static_4);// line 10
p(post.postedAt);// line 11
p(static_5);// line 11
p(post.author.name);// line 12
p(static_6);// line 12
p(post.author.gender);// line 12
p(static_7);// line 12
}// line 14
p(static_8);// line 14

	}
}