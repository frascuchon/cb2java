/* This file was generated by SableCC (http://www.sablecc.org/). */
package net.sf.cb2xml.sablecc.node;

import net.sf.cb2xml.sablecc.analysis.*;

import java.util.*;


public final class AObjectReferencePhrase extends PObjectReferencePhrase
{
    private TObject _object_;
    private TReference _reference_;
    private TDataName _dataName_;

    public AObjectReferencePhrase ()
    {
    }

    public AObjectReferencePhrase (TObject _object_, TReference _reference_,
        TDataName _dataName_)
    {
        setObject (_object_);

        setReference (_reference_);

        setDataName (_dataName_);
    }

    public Object clone ()
    {
        return new AObjectReferencePhrase((TObject) cloneNode (_object_),
            (TReference) cloneNode (_reference_),
            (TDataName) cloneNode (_dataName_));
    }

    public void apply (Switch sw)
    {
        ((Analysis) sw).caseAObjectReferencePhrase (this);
    }

    public TObject getObject ()
    {
        return _object_;
    }

    public void setObject (TObject node)
    {
        if (_object_ != null)
        {
            _object_.parent (null);
        }

        if (node != null)
        {
            if (node.parent () != null)
            {
                node.parent ().removeChild (node);
            }

            node.parent (this);
        }

        _object_ = node;
    }

    public TReference getReference ()
    {
        return _reference_;
    }

    public void setReference (TReference node)
    {
        if (_reference_ != null)
        {
            _reference_.parent (null);
        }

        if (node != null)
        {
            if (node.parent () != null)
            {
                node.parent ().removeChild (node);
            }

            node.parent (this);
        }

        _reference_ = node;
    }

    public TDataName getDataName ()
    {
        return _dataName_;
    }

    public void setDataName (TDataName node)
    {
        if (_dataName_ != null)
        {
            _dataName_.parent (null);
        }

        if (node != null)
        {
            if (node.parent () != null)
            {
                node.parent ().removeChild (node);
            }

            node.parent (this);
        }

        _dataName_ = node;
    }

    public String toString ()
    {
        return "" + toString (_object_) + toString (_reference_) +
        toString (_dataName_);
    }

    void removeChild (Node child)
    {
        if (_object_ == child)
        {
            _object_ = null;

            return;
        }

        if (_reference_ == child)
        {
            _reference_ = null;

            return;
        }

        if (_dataName_ == child)
        {
            _dataName_ = null;

            return;
        }
    }

    void replaceChild (Node oldChild, Node newChild)
    {
        if (_object_ == oldChild)
        {
            setObject ((TObject) newChild);

            return;
        }

        if (_reference_ == oldChild)
        {
            setReference ((TReference) newChild);

            return;
        }

        if (_dataName_ == oldChild)
        {
            setDataName ((TDataName) newChild);

            return;
        }
    }
}
