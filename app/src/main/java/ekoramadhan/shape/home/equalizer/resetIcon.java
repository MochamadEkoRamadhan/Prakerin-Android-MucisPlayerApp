package ekoramadhan.shape.home.equalizer;import android.content.Context;import android.graphics.LinearGradient;import android.graphics.Path;import Views.api.ShapeView;import Views.api.shapeImg;import ekoramadhan.linedeer.player.Ui;import android.graphics.Paint;import android.graphics.Canvas;public class resetIcon extends shapeImg{ class Path0 extends Path{  	public Path0() {			moveTo(29.75f, 30f);			lineTo(-0.25f, 30f);			lineTo(-0.25f, 0f);			lineTo(29.75f, 0f);			lineTo(29.75f, 30f);	}}class Path1 extends Path{  	public Path1() {			moveTo(20.45f, 20.5f);			quadTo(21.75f, 19.25f, 22.25f, 17.6f);			lineTo(23.45f, 18.8f);			quadTo(22.75f, 20.25f, 21.5f, 21.55f);			quadTo(20.6f, 22.45f, 19.6f, 23.05f);			quadTo(17.65f, 24.25f, 15.1f, 24.2f);			quadTo(11.35f, 24.25f, 8.65f, 21.6f);			quadTo(6.05f, 19f, 6.1f, 15.2f);			quadTo(6.05f, 12.7f, 7.2f, 10.7f);			lineTo(8.7f, 8.8f);			quadTo(11.35f, 6.15f, 15.15f, 6.15f);			lineTo(15.2f, 6.15f);			lineTo(16.65f, 6.3f);			lineTo(16.4f, 7.75f);			lineTo(15.05f, 7.65f);			quadTo(11.95f, 7.7f, 9.8f, 9.85f);			quadTo(8.9f, 10.75f, 8.35f, 11.8f);			quadTo(7.5f, 13.3f, 7.5f, 15.2f);			quadTo(7.55f, 18.3f, 9.75f, 20.5f);			quadTo(11.95f, 22.7f, 15.05f, 22.75f);			quadTo(16.9f, 22.7f, 18.5f, 21.95f);			lineTo(20.45f, 20.5f);	}}class Path2 extends Path{  	public Path2() {			moveTo(20.6f, 7.5f);			lineTo(15.8f, 9.9f);			lineTo(16.7f, 5.2f);			lineTo(16.85f, 3.75f);			lineTo(20.6f, 7.5f);	}}		public Paint P0 = new Paint(); 		public static int Color0 = (0x00968fac); 		public Path0 S0 = new Path0();		public Paint P1 = new Paint(); 		public static int Color1 = (0xFF968fac); 		public Path1 S1 = new Path1();		public Paint P2 = new Paint(); 		public static int Color2 = (0xFF968fac); 		public Path2 S2 = new Path2();		public static float Ht = 30F; 		public static float Wh = 30F;  		public resetIcon(int width,int height,int x,int y) {			this.width = width;			this.height = height;			init((float)width/(float)Wh, (float)height/(float)Ht, x, y); 			LinearGradient Lg  = null;			S0.transform(matrix);			P0.setColor(0x00968fac);			P0.setAntiAlias(true);			S1.transform(matrix);			P1.setColor(0xFF968fac);			P1.setAntiAlias(true);			S2.transform(matrix);			P2.setColor(0xFF968fac);			P2.setAntiAlias(true);			mask = S0;			maskPaint = P0;		} 		public void draw(Canvas canvas) { 			if(drawing){				canvas.drawPath(S0, P0);				canvas.drawPath(S1, P1);				canvas.drawPath(S2, P2);			}		} 		@Override 		public void setX(int x) {			super.setX(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);		} 		@Override 		public void setY(int x) {			super.setY(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);		} 		@Override 		public void setSize(int wh, int ht) {			super.setSize(wh, ht);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);		} 		 public static ShapeView getFMview(Context context,boolean mask){		   ShapeView view = new ShapeView(context, Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht));		   final resetIcon viewImg = new resetIcon(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   view.mask = mask;		   view.img = viewImg;		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return view;		 }      		 public static resetIcon getShape(){		   final resetIcon viewImg = new resetIcon(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return viewImg;		 }     }//Finished...! 