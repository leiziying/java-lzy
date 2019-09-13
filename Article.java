public class Article {
    String   title;
    String  author;
    String  content;
    String  publishedAt;
    @Override
    public  boolean  equals(Object  obj){//覆写equals方法，判断语义是否相等
        if(obj==null){//如果传入的参数为空就直接返回false
            return   false;
        }
        if(!(obj instanceof   Article)){//判断左边的对象是否是右边的实例
            return  false;//如果传入的参数不能指向Article类型的对象，直接返回false
        }
        if(obj==this){//走到这里说明obj不为空obj同时是Article类型的引用
            return  true;//如果obj和this指向同一个对象，返回true
        }
      Article a=(Article)obj;//走到这里说明obj和this不是指向同一个对象，此时就需要判断obj和this所指向对象的内容是否相等
        if(!title.equals(a.title)){//判断title属性是否相等，这里的equals是Object类中定义的只是==的比较
            return  false;//只要一个属性不一样就直接返回false
        }
        if(!author.equals(a.author)){//判断author是否相等
            return  false;
        }
        if(!content.equals(a.content)){//判断content是否相等
            return  false;
        }
        return  publishedAt.equals(a.publishedAt);//走到这里说明obj和this不是指向同一个对象。但是除了publishedAt没有比较之外其他属性都相等，所以直接返回publishedAt比较的结果
    }
}
