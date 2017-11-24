#import sqlalchemy as sa
#from sqlalchemy.ext.declarative import declarative_base
#Base = declarative_base()
#class Zoo(Base):
   # conn = sa.create_engine('sqlite:///zoo.db')


#__tablename__ = 'zoo'
#critter = sa.Column('critter', sa.String, primary_key=True)
#count = sa.Column('count', sa.Integer)
#damages = sa.Column('damages', sa.Float)

#def __init__(self, critter, count, damages):
  #  self.critter = critter
  #  self.count = count
  #  self.damages = damages

#def __repr__(self):
 #   return "<Zoo({}, {}, {})>".format(self.critter, self.count, self.damages)
# create BD and table
#Base.metadata.create_all(conn)

#first = Zoo('duck', 10, 0.0)
#second = Zoo('bear', 10, 1000.0)
#third = Zoo('weales', 1, 2000.0)
#print(first)

