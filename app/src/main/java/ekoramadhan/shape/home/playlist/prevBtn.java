package ekoramadhan.shape.home.playlist;import android.content.Context;import android.graphics.LinearGradient;import android.graphics.Path;import Views.api.ShapeView;import Views.api.shapeImg;import ekoramadhan.linedeer.player.Ui;import android.graphics.Paint;import android.graphics.Canvas;public class prevBtn extends shapeImg{ class Path0 extends Path{  	public Path0() {			moveTo(20f, 0f);			quadTo(30f, 0f, 30f, 10f);			lineTo(30f, 40f);			quadTo(30f, 50f, 20f, 50f);			lineTo(10f, 50f);			quadTo(0f, 50f, 0f, 40f);			lineTo(0f, 10f);			quadTo(0f, 0f, 10f, 0f);			lineTo(20f, 0f);	}}class Path1 extends Path{  	public Path1() {			moveTo(19.65f, 16.5f);			lineTo(9.05f, 27.1f);			lineTo(6.9f, 24.95f);			lineTo(17.5f, 14.35f);			lineTo(19.65f, 16.5f);	}}class Path2 extends Path{  	public Path2() {			moveTo(17.35f, 35.7f);			lineTo(6.75f, 25.1f);			lineTo(8.85f, 23f);			lineTo(19.45f, 33.6f);			lineTo(17.35f, 35.7f);	}}		public Paint P0 = new Paint(); 		public static int Color0 = (0x0054497c); 		public Path0 S0 = new Path0();		public Paint P1 = new Paint(); 		public static int Color1 = (0xFFd35d69); 		public Path1 S1 = new Path1();		public Paint P2 = new Paint(); 		public static int Color2 = (0xFFd35d69); 		public Path2 S2 = new Path2();		public static float Ht = 50F; 		public static float Wh = 30F;  		public prevBtn(int width,int height,int x,int y) {			this.width = width;			this.height = height;			init((float)width/(float)Wh, (float)height/(float)Ht, x, y); 			LinearGradient Lg  = null;			S0.transform(matrix);			P0.setColor(0x0054497c);			P0.setAntiAlias(true);			S1.transform(matrix);			P1.setColor(0xFFd35d69);			P1.setAntiAlias(true);			S2.transform(matrix);			P2.setColor(0xFFd35d69);			P2.setAntiAlias(true);			mask = S0;			maskPaint = P0;		} 		public void draw(Canvas canvas) { 			if(drawing){				canvas.drawPath(S0, P0);				canvas.drawPath(S1, P1);				canvas.drawPath(S2, P2);			}		} 		@Override 		public void setX(int x) {			super.setX(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);		} 		@Override 		public void setY(int x) {			super.setY(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);		} 		@Override 		public void setSize(int wh, int ht) {			super.setSize(wh, ht);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);		} 		 public static ShapeView getFMview(Context context,boolean mask){		   ShapeView view = new ShapeView(context, Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht));		   final prevBtn viewImg = new prevBtn(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   view.mask = mask;		   view.img = viewImg;		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return view;		 }      		 public static prevBtn getShape(){		   final prevBtn viewImg = new prevBtn(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return viewImg;		 }     }//Finished...! 