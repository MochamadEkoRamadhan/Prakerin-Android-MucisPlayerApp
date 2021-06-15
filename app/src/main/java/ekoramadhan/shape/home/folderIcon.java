package ekoramadhan.shape.home;import android.content.Context;import android.graphics.LinearGradient;import android.graphics.Path;import Views.api.ShapeView;import Views.api.shapeImg;import android.graphics.Paint;import android.graphics.Canvas;import ekoramadhan.linedeer.player.Ui;public class folderIcon extends shapeImg{ class Path0 extends Path{  	public Path0() {			moveTo(11.5f, 0f);			lineTo(28.5f, 0f);			quadTo(40f, 0f, 40f, 11.5f);			lineTo(40f, 50.5f);			quadTo(40f, 62f, 28.5f, 62f);			lineTo(11.5f, 62f);			quadTo(0f, 62f, 0f, 50.5f);			lineTo(0f, 11.5f);			quadTo(0f, 0f, 11.5f, 0f);	}}class Path1 extends Path{  	public Path1() {			moveTo(18f, 7.5f);			lineTo(22f, 7.5f);			quadTo(25f, 7.5f, 25f, 10.5f);			lineTo(25f, 51.5f);			quadTo(25f, 54.5f, 22f, 54.5f);			lineTo(18f, 54.5f);			quadTo(15f, 54.5f, 15f, 51.5f);			lineTo(15f, 10.5f);			quadTo(15f, 7.5f, 18f, 7.5f);	}}class Path2 extends Path{  	public Path2() {			moveTo(30.7f, 24.7f);			quadTo(30.4f, 25f, 30f, 25f);			lineTo(10f, 25f);			quadTo(9.6f, 25f, 9.3f, 24.7f);			quadTo(9f, 24.4f, 9f, 24f);			quadTo(9f, 23.6f, 9.3f, 23.3f);			quadTo(9.6f, 23f, 10f, 23f);			lineTo(30f, 23f);			quadTo(30.4f, 23f, 30.7f, 23.3f);			lineTo(31f, 24f);			lineTo(30.7f, 24.7f);	}}class Path3 extends Path{  	public Path3() {			moveTo(30.7f, 31.7f);			quadTo(30.4f, 32f, 30f, 32f);			lineTo(10f, 32f);			quadTo(9.6f, 32f, 9.3f, 31.7f);			quadTo(9f, 31.4f, 9f, 31f);			quadTo(9f, 30.6f, 9.3f, 30.3f);			quadTo(9.6f, 30f, 10f, 30f);			lineTo(30f, 30f);			quadTo(30.4f, 30f, 30.7f, 30.3f);			lineTo(31f, 31f);			lineTo(30.7f, 31.7f);	}}class Path4 extends Path{  	public Path4() {			moveTo(30.7f, 38.2f);			quadTo(30.4f, 38.5f, 30f, 38.5f);			lineTo(10f, 38.5f);			quadTo(9.6f, 38.5f, 9.3f, 38.2f);			quadTo(9f, 37.9f, 9f, 37.5f);			quadTo(9f, 37.1f, 9.3f, 36.8f);			quadTo(9.6f, 36.5f, 10f, 36.5f);			lineTo(30f, 36.5f);			quadTo(30.4f, 36.5f, 30.7f, 36.8f);			lineTo(31f, 37.5f);			lineTo(30.7f, 38.2f);	}}		public Paint P0 = new Paint(); 		public static int Color0 = (0x0054497c); 		public Path0 S0 = new Path0();		public Paint P1 = new Paint(); 		public static int Color1 = (0xFF54497c); 		public Path1 S1 = new Path1();		public Paint P2 = new Paint(); 		public static int Color2 = (0xFFcccccc); 		public Path2 S2 = new Path2();		public Paint P3 = new Paint(); 		public static int Color3 = (0xFFcccccc); 		public Path3 S3 = new Path3();		public Paint P4 = new Paint(); 		public static int Color4 = (0xFFcccccc); 		public Path4 S4 = new Path4();		public static float Ht = 62F; 		public static float Wh = 40F;  		public folderIcon(int width,int height,int x,int y) {			this.width = width;			this.height = height;			init((float)width/(float)Wh, (float)height/(float)Ht, x, y); 			LinearGradient Lg  = null;			S0.transform(matrix);			P0.setColor(0x0054497c);			P0.setAntiAlias(true);			S1.transform(matrix);			P1.setColor(0xFF54497c);			P1.setAntiAlias(true);			S2.transform(matrix);			P2.setColor(0xFFcccccc);			P2.setAntiAlias(true);			S3.transform(matrix);			P3.setColor(0xFFcccccc);			P3.setAntiAlias(true);			S4.transform(matrix);			P4.setColor(0xFFcccccc);			P4.setAntiAlias(true);			mask = S0;			maskPaint = P0;		} 		public void draw(Canvas canvas) { 			if(drawing){				canvas.drawPath(S0, P0);				canvas.drawPath(S1, P1);				canvas.drawPath(S2, P2);				canvas.drawPath(S3, P3);				canvas.drawPath(S4, P4);			}		} 		@Override 		public void setX(int x) {			super.setX(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);			 S4.transform(matrix);		} 		@Override 		public void setY(int x) {			super.setY(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);			 S4.transform(matrix);		} 		@Override 		public void setSize(int wh, int ht) {			super.setSize(wh, ht);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);			 S4.transform(matrix);		} 		 public static ShapeView getFMview(Context context,boolean mask){		   ShapeView view = new ShapeView(context, Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht));		   final folderIcon viewImg = new folderIcon(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   view.mask = mask;		   view.img = viewImg;		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return view;		 }      		 public static folderIcon getShape(){		   final folderIcon viewImg = new folderIcon(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return viewImg;		 }     }//Finished...! 