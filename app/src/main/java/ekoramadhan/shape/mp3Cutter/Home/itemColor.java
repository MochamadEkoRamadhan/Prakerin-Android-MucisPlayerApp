package ekoramadhan.shape.mp3Cutter.Home;import android.content.Context;import android.graphics.LinearGradient;import android.graphics.Path;import Views.api.ShapeView;import Views.api.shapeImg;import ekoramadhan.linedeer.player.Ui;import android.graphics.Paint;import android.graphics.Canvas;public class itemColor extends shapeImg{ class Path0 extends Path{  	public Path0() {			moveTo(35.55f, 0f);			lineTo(35.55f, 35.55f);			lineTo(0f, 35.55f);			lineTo(0f, 0f);			lineTo(35.55f, 0f);	}}		public Paint P0 = new Paint(); 		public static int Color0 = (0xFFb2adc2); 		public Path0 S0 = new Path0();		public static float Ht = 35.55F; 		public static float Wh = 35.55F;  		public itemColor(int width,int height,int x,int y) {			this.width = width;			this.height = height;			init((float)width/(float)Wh, (float)height/(float)Ht, x, y); 			LinearGradient Lg  = null;			S0.transform(matrix);			P0.setColor(0xFFb2adc2);			P0.setAntiAlias(true);			mask = S0;			maskPaint = P0;		} 		public void draw(Canvas canvas) { 			if(drawing){				canvas.drawPath(S0, P0);			}		} 		@Override 		public void setX(int x) {			super.setX(x);			 S0.transform(matrix);		} 		@Override 		public void setY(int x) {			super.setY(x);			 S0.transform(matrix);		} 		@Override 		public void setSize(int wh, int ht) {			super.setSize(wh, ht);			 S0.transform(matrix);		} 		 public static ShapeView getFMview(Context context,boolean mask){		   ShapeView view = new ShapeView(context, Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht));		   final itemColor viewImg = new itemColor(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   view.mask = mask;		   view.img = viewImg;		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return view;		 }      		 public static itemColor getShape(){		   final itemColor viewImg = new itemColor(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return viewImg;		 }     }//Finished...! 