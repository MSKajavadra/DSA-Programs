class Update_Delete
{
	public static void main(String[] args)
	{	
		int l=0;
		int[] arr = new int[10];
		arr[l]=20;	l++;
		arr[l]=30;	l++;
		arr[l]=40;	l++;
		arr[l]=50;	

		for(int i=0;i<=l;i++)
		{
			System.out.print(arr[i] + " ");
		}

		update(arr,l,20,10);
			
		l=delete(arr,l,40);
			
		for(int i=0;i<=l;i++)
		{
			System.out.print("\n" + arr[i] + " ");
		}
	}

	private static void update(int[] arr,int l,int value,int temp)
	{
		for(int i=0;i<=l;i++)
		{
			if(arr[i] == value)
				arr[i]=temp;
		}
	}

	private static int delete(int[] arr,int l,int value)
	{
		for(int i=0;i<l;i++)
		{
			if(arr[i] == value)
			{
				l--;
				for(int j=i;j<l;j++)
				{
					arr[j]=arr[j+1];
				}
			}
		}
		return l;
	}
}