package ekoramadhan.shape.home.QEq;import android.content.Context;import android.graphics.LinearGradient;import android.graphics.Path;import Views.api.ShapeView;import Views.api.shapeImg;import android.graphics.Paint;import android.graphics.Canvas;import ekoramadhan.linedeer.player.Ui;public class selectedIcon extends shapeImg{ class Path0 extends Path{  	public Path0() {			moveTo(40f, 0f);			lineTo(40f, 40f);			lineTo(0f, 40f);			lineTo(0f, 0f);			lineTo(40f, 0f);	}}class Path1 extends Path{  	public Path1() {			moveTo(28.2f, 15.35f);			lineTo(17.6f, 25.95f);			lineTo(16.2f, 24.55f);			lineTo(26.8f, 13.95f);			lineTo(28.2f, 15.35f);	}}class Path2 extends Path{  	public Path2() {			moveTo(17.5f, 26.05f);			lineTo(11.85f, 20.4f);			lineTo(13.25f, 19f);			lineTo(18.9f, 24.65f);			lineTo(17.5f, 26.05f);	}}class Path3 extends Path{  	public Path3() {			moveTo(27f, 7f);			lineTo(13f, 7f);			quadTo(7f, 7f, 7f, 13f);			lineTo(7f, 27f);			quadTo(7f, 33f, 13f, 33f);			lineTo(27f, 33f);			quadTo(33f, 33f, 33f, 27f);			lineTo(33f, 13f);			quadTo(33f, 7f, 27f, 7f);			moveTo(27f, 5f);			quadTo(35f, 5f, 35f, 13f);			lineTo(35f, 27f);			quadTo(35f, 35f, 27f, 35f);			lineTo(13f, 35f);			quadTo(5f, 35f, 5f, 27f);			lineTo(5f, 13f);			quadTo(5f, 5f, 13f, 5f);			lineTo(27f, 5f);	}}		public Paint P0 = new Paint(); 		public static int Color0 = (0x00d35d69); 		public Path0 S0 = new Path0();		public Paint P1 = new Paint(); 		public static int Color1 = (0xFFffffff); 		public Path1 S1 = new Path1();		public Paint P2 = new Paint(); 		public static int Color2 = (0xFFffffff); 		public Path2 S2 = new Path2();		public Paint P3 = new Paint(); 		public static int Color3 = (0xfcd35d69); 		public Path3 S3 = new Path3();		public static float Ht = 40F; 		public static float Wh = 40F;  		public selectedIcon(int width,int height,int x,int y) {			this.width = width;			this.height = height;			init((float)width/(float)Wh, (float)height/(float)Ht, x, y); 			LinearGradient Lg  = null;			S0.transform(matrix);			P0.setColor(0x00d35d69);			P0.setAntiAlias(true);			S1.transform(matrix);			P1.setColor(0xFFffffff);			P1.setAntiAlias(true);			S2.transform(matrix);			P2.setColor(0xFFffffff);			P2.setAntiAlias(true);			S3.transform(matrix);			P3.setColor(0xfcd35d69);			P3.setAntiAlias(true);			mask = S0;			maskPaint = P0;		} 		public void draw(Canvas canvas) { 			if(drawing){				canvas.drawPath(S0, P0);				canvas.drawPath(S1, P1);				canvas.drawPath(S2, P2);				canvas.drawPath(S3, P3);			}		} 		@Override 		public void setX(int x) {			super.setX(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);		} 		@Override 		public void setY(int x) {			super.setY(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);		} 		@Override 		public void setSize(int wh, int ht) {			super.setSize(wh, ht);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);		} 		 public static ShapeView getFMview(Context context,boolean mask){		   ShapeView view = new ShapeView(context, Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht));		   final selectedIcon viewImg = new selectedIcon(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   view.mask = mask;		   view.img = viewImg;		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return view;		 }      		 public static selectedIcon getShape(){		   final selectedIcon viewImg = new selectedIcon(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return viewImg;		 }     }//Finished...! 