package cz.skylights.spitt.model;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

public class GameObject {
	public float X;
	public float Y;
    public float scaleX = 0.25f;
    public float scaleY = 0.25f;
	public float Width;  // bylo by dobre znat sirku
	public float Height; // bylo by dobre znat vysku
	
    protected FloatBuffer vertexBuffer; 
    protected FloatBuffer textureBuffer; 
    protected ByteBuffer indexBuffer; 
		           
}
