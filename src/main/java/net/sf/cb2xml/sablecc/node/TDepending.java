/* This file was generated by SableCC (http://www.sablecc.org/). */
package net.sf.cb2xml.sablecc.node;

import net.sf.cb2xml.sablecc.analysis.*;


public final class TDepending extends Token
{
    public TDepending (String text)
    {
        setText (text);
    }

    public TDepending (String text, int line, int pos)
    {
        setText (text);
        setLine (line);
        setPos (pos);
    }

    public Object clone ()
    {
        return new TDepending(getText (), getLine (), getPos ());
    }

    public void apply (Switch sw)
    {
        ((Analysis) sw).caseTDepending (this);
    }
}
