/* This file was generated by SableCC (http://www.sablecc.org/). */
package net.sf.cb2xml.sablecc.node;

import net.sf.cb2xml.sablecc.analysis.*;

import java.util.*;


public final class AItemElementaryItem extends PElementaryItem
{
    private PItem _item_;

    public AItemElementaryItem ()
    {
    }

    public AItemElementaryItem (PItem _item_)
    {
        setItem (_item_);
    }

    public Object clone ()
    {
        return new AItemElementaryItem((PItem) cloneNode (_item_));
    }

    public void apply (Switch sw)
    {
        ((Analysis) sw).caseAItemElementaryItem (this);
    }

    public PItem getItem ()
    {
        return _item_;
    }

    public void setItem (PItem node)
    {
        if (_item_ != null)
        {
            _item_.parent (null);
        }

        if (node != null)
        {
            if (node.parent () != null)
            {
                node.parent ().removeChild (node);
            }

            node.parent (this);
        }

        _item_ = node;
    }

    public String toString ()
    {
        return "" + toString (_item_);
    }

    void removeChild (Node child)
    {
        if (_item_ == child)
        {
            _item_ = null;

            return;
        }
    }

    void replaceChild (Node oldChild, Node newChild)
    {
        if (_item_ == oldChild)
        {
            setItem ((PItem) newChild);

            return;
        }
    }
}
