package ekoramadhan.shape.Library.Icon;import android.content.Context;import android.graphics.LinearGradient;import android.graphics.Path;import Views.api.ShapeView;import Views.api.shapeImg;import ekoramadhan.linedeer.player.Ui;import android.graphics.Paint;import android.graphics.Canvas;public class inputIcon extends shapeImg{ class Path0 extends Path{  	public Path0() {			moveTo(37f, 0f);			quadTo(50f, 0f, 50f, 13f);			lineTo(50f, 37f);			quadTo(50f, 50f, 37f, 50f);			lineTo(13f, 50f);			quadTo(0f, 50f, 0f, 37f);			lineTo(0f, 13f);			quadTo(0f, 0f, 13f, 0f);			lineTo(37f, 0f);	}}class Path1 extends Path{  	public Path1() {			moveTo(45f, 18f);			lineTo(45f, 32f);			quadTo(45f, 45f, 32f, 45f);			lineTo(18f, 45f);			quadTo(5f, 45f, 5f, 32f);			lineTo(5f, 18f);			quadTo(5f, 5f, 18f, 5f);			lineTo(32f, 5f);			quadTo(45f, 5f, 45f, 18f);	}}class Path2 extends Path{  	public Path2() {			moveTo(25.85f, 15f);			lineTo(25.85f, 35f);			lineTo(24.1f, 35f);			lineTo(24.1f, 15f);			lineTo(25.85f, 15f);	}}class Path3 extends Path{  	public Path3() {			moveTo(30f, 16.75f);			lineTo(20f, 16.75f);			lineTo(20f, 15f);			lineTo(30f, 15f);			lineTo(30f, 16.75f);	}}class Path4 extends Path{  	public Path4() {			moveTo(30f, 35f);			lineTo(20f, 35f);			lineTo(20f, 33.25f);			lineTo(30f, 33.25f);			lineTo(30f, 35f);	}}		public Paint P0 = new Paint(); 		public static int Color0 = (0x02695b99); 		public Path0 S0 = new Path0();		public Paint P1 = new Paint(); 		public static int Color1 = (0x26000000); 		public Path1 S1 = new Path1();		public Paint P2 = new Paint(); 		public static int Color2 = (0xFFffffff); 		public Path2 S2 = new Path2();		public Paint P3 = new Paint(); 		public static int Color3 = (0xFFffffff); 		public Path3 S3 = new Path3();		public Paint P4 = new Paint(); 		public static int Color4 = (0xFFffffff); 		public Path4 S4 = new Path4();		public static float Ht = 50F; 		public static float Wh = 50F;  		public inputIcon(int width,int height,int x,int y) {			this.width = width;			this.height = height;			init((float)width/(float)Wh, (float)height/(float)Ht, x, y); 			LinearGradient Lg  = null;			S0.transform(matrix);			P0.setColor(0x02695b99);			P0.setAntiAlias(true);			S1.transform(matrix);			P1.setColor(0x26000000);			P1.setAntiAlias(true);			S2.transform(matrix);			P2.setColor(0xFFffffff);			P2.setAntiAlias(true);			S3.transform(matrix);			P3.setColor(0xFFffffff);			P3.setAntiAlias(true);			S4.transform(matrix);			P4.setColor(0xFFffffff);			P4.setAntiAlias(true);			mask = S0;			maskPaint = P0;		} 		public void draw(Canvas canvas) { 			if(drawing){				canvas.drawPath(S0, P0);				canvas.drawPath(S1, P1);				canvas.drawPath(S2, P2);				canvas.drawPath(S3, P3);				canvas.drawPath(S4, P4);			}		} 		@Override 		public void setX(int x) {			super.setX(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);			 S4.transform(matrix);		} 		@Override 		public void setY(int x) {			super.setY(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);			 S4.transform(matrix);		} 		@Override 		public void setSize(int wh, int ht) {			super.setSize(wh, ht);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);			 S4.transform(matrix);		} 		 public static ShapeView getFMview(Context context,boolean mask){		   ShapeView view = new ShapeView(context, Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht));		   final inputIcon viewImg = new inputIcon(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   view.mask = mask;		   view.img = viewImg;		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return view;		 }      		 public static inputIcon getShape(){		   final inputIcon viewImg = new inputIcon(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return viewImg;		 }     }//Finished...! 